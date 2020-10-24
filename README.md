# TallerJava

# Diagrama de componentes

![alt text](https://github.com/arqempsw/TallerJava/blob/main/DiagramaComponentes.png)

# Ejecución del proyecto

1.Conectarse a la VPN de la Javeriana. 

2.Clonar el repositorio. (git clone https://github.com/arqempsw/TallerJava.git)

3. En la carpeta TallerJava ejecutar: docker-compose build

4. luego docker-compose up -d

5. El endpoint de validacion de tarjetas de credito es:  http://localhost:8081/api/v1/ValidarTarjetas/3 donde (3) es el número de la tarjeta de credito, si la tarjeta no existe se devuelve un 404.

6. El endpoint de validación del pago es: http://localhost:8081/api/v1/Validar devolviendo un False cuando no es exitoso.
