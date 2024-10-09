import cv2
import numpy as np

# Carregando os classificadores Haar para rosto e olhos
face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
eye_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_eye.xml')

# Função para detectar a direção do olhar (baseada na posição dos olhos)
def detect_gaze_direction(eyes, frame):
    for (ex, ey, ew, eh) in eyes:
        # Extraindo a região dos olhos para análise
        eye_region = frame[ey:ey+eh, ex:ex+ew]
        # Convertendo para escala de cinza
        eye_gray = cv2.cvtColor(eye_region, cv2.COLOR_BGR2GRAY)
        # Aplicando um limiar (threshold) para simplificar a detecção
        _, threshold_eye = cv2.threshold(eye_gray, 70, 255, cv2.THRESH_BINARY)

        # Determinando a parte escura do olho (pupila)
        eye_center_x = int(ew / 2)
        eye_center_y = int(eh / 2)
        
        # Verificando se a pupila está no centro, esquerda ou direita
        left_part = threshold_eye[:, 0:int(ew/2)]
        right_part = threshold_eye[:, int(ew/2):]
        
        left_intensity = np.sum(left_part == 0)
        right_intensity = np.sum(right_part == 0)
        
        # Interpretar a direção
        if left_intensity > right_intensity:
            direction = "Olhar para a Esquerda"
        elif right_intensity > left_intensity:
            direction = "Olhar para a Direita"
        else:
            direction = "Olhar para Frente"
        
        return direction
    return "Olhos não detectados"

# Função principal de detecção
def detect_and_track_gaze():
    # Capturando o vídeo da webcam
    cap = cv2.VideoCapture(0)

    while True:
        # Leitura da imagem da câmera
        ret, frame = cap.read()
        if not ret:
            break
        
        # Convertendo para escala de cinza
        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

        # Detectando rostos na imagem
        faces = face_cascade.detectMultiScale(gray, 1.3, 5)

        for (x, y, w, h) in faces:
            # Desenhar um retângulo ao redor do rosto detectado
            cv2.rectangle(frame, (x, y), (x + w, y + h), (255, 0, 0), 2)

            # Recortar a área do rosto para detecção dos olhos
            roi_gray = gray[y:y + h, x:x + w]
            roi_color = frame[y:y + h, x:x + w]

            # Detectar os olhos dentro do rosto
            eyes = eye_cascade.detectMultiScale(roi_gray)

            # Desenhar retângulos ao redor dos olhos
            for (ex, ey, ew, eh) in eyes:
                cv2.rectangle(roi_color, (ex, ey), (ex + ew, ey + eh), (0, 255, 0), 2)
            
            # Verificar direção do olhar
            gaze_direction = detect_gaze_direction(eyes, roi_color)
            cv2.putText(frame, gaze_direction, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.9, (36, 255, 12), 2)

        # Mostrar a imagem processada
        cv2.imshow('Detecção de Pessoas e Rastreamento de Olhares', frame)

        # Fechar a janela ao pressionar 'q'
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

    # Liberar a captura de vídeo e fechar as janelas
    cap.release()
    cv2.destroyAllWindows()

if __name__ == '__main__':
    detect_and_track_gaze()
