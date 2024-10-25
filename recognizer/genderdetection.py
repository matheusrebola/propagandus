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
def build_gender_model():
    base_model = MobileNetV2(weights='imagenet', include_top=False, input_shape=(224, 224, 3))
    
    # Adicionando camadas de classificação em cima da MobileNetV2
    x = base_model.output
    x = GlobalAveragePooling2D()(x)
    x = Dense(128, activation='relu')(x)
    predictions = Dense(1, activation='sigmoid')(x)  # Usando sigmoid para classificar entre 2 classes (masculino/feminino)
    
    model = Model(inputs=base_model.input, outputs=predictions)
    
    # Compilando o modelo
    model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])
    
    return model

# Função para fazer a previsão de gênero (0 = Masculino, 1 = Feminino)
def predict_gender(model, image_path):
    image = process_image(image_path)
    prediction = model.predict(image)
    
    if prediction < 0.5:
        return 'Masculino'
    else:
        return 'Feminino'

# Exemplo de uso
if __name__ == '__main__':
    # Carregar o modelo de gênero
    gender_model = build_gender_model()

    # Supondo que você já treinou o modelo em um conjunto de dados
    # Caso contrário, você pode carregar um modelo treinado com:
    # gender_model.load_weights('caminho/para/o/modelo_pesos.h5')

    # Caminho da imagem para teste
    test_image_path = 'caminho_para_imagem_teste.jpg'

    # Previsão de gênero
    resultado = predict_gender(gender_model, test_image_path)
    print(f'Gênero previsto: {resultado}')