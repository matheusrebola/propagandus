import cv2
import numpy as np
from tensorflow.keras.applications import MobileNetV2
from tensorflow.keras.applications.mobilenet_v2 import preprocess_input
from tensorflow.keras.models import Model
from tensorflow.keras.layers import Dense, GlobalAveragePooling2D
from tensorflow.keras.preprocessing.image import img_to_array
from tensorflow.keras.preprocessing.image import load_img

# Função para carregar e pré-processar a imagem
def process_image(image_path, target_size=(224, 224)):
    image = load_img(image_path, target_size=target_size)
    image = img_to_array(image)
    image = np.expand_dims(image, axis=0)
    image = preprocess_input(image)
    return image

# Carregando o modelo MobileNetV2 pré-treinado
def build_emotion_model():
    base_model = MobileNetV2(weights='imagenet', include_top=False, input_shape=(224, 224, 3))
    
    # Adicionando camadas de classificação em cima da MobileNetV2
    x = base_model.output
    x = GlobalAveragePooling2D()(x)
    x = Dense(128, activation='relu')(x)
    predictions = Dense(8, activation='softmax')(x)  # 8 classes: NEUTRO, FELIZ, TRISTE, IRRITADO, SURPRESO, DESCONFIADO, ENTUSIASMADO
    
    model = Model(inputs=base_model.input, outputs=predictions)
    
    # Compilando o modelo
    model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])
    
    return model

# Função para prever a emoção
def predict_emotion(model, image_path):
    image = process_image(image_path)
    prediction = model.predict(image)
    
    # Mapeando as classes para as emoções
    emotion_classes = ['NEUTRO', 'FELIZ', 'TRISTE', 'IRRITADO', 'SURPRESO', 'DESCONFIADO', 'ENTUSIASMADO']
    predicted_class = np.argmax(prediction)
    
    return emotion_classes[predicted_class]

# Exemplo de uso
if __name__ == '__main__':
    # Carregar o modelo de emoções
    emotion_model = build_emotion_model()

    # Supondo que você já treinou o modelo em um conjunto de dados
    # Caso contrário, você pode carregar um modelo treinado com:
    # emotion_model.load_weights('caminho/para/o/modelo_pesos.h5')

    # Caminho da imagem para teste
    test_image_path = 'caminho_para_imagem_teste.jpg'

    # Previsão de emoção
    resultado = predict_emotion(emotion_model, test_image_path)
    print(f'Emoção prevista: {resultado}')
