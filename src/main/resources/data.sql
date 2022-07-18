INSERT INTO CLIENTES(NOMBRE,APELLIDO,FECHA)
VALUES
('Halley','Juniper','2002-05-30'),
('Julian','Seita','2003-04-29'),
('Gomez','Fez','2012-04-13');

INSERT INTO PRODUCTOS(MODELO,PRECIO,STOCK)
VALUES
('Auriculares de Monitorización ATH-M70X', 25000, 10),
('Auriculares de madera dinámicos cerrados ATH-AWAS', 150000, 3),
('Tocadiscos de transmisión correo manual AT-LP7', 100000, 5);

INSERT INTO RECIBO(IDCLIENT,CANTIDAD,FECHA,TOTAL)
VALUES
(12345678, 5, '2022-05-05', 125000),
(23456789, 1, '2022-05-06', 100000);
