CREATE TABLE IF NOT EXISTS mascota (
    id IDENTITY PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    fecha_nac DATE NOT NULL,
    raza VARCHAR(50) NOT NULL,
    peso VARCHAR(10) NOT NULL,
    tiene_chip BOOLEAN NOT NULL,
    url_foto VARCHAR(255)
);

INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Pepa', '2023-03-20', 'chihuahua', '1.5', true, 'www.pepe-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Luna', '2022-11-15', 'labrador', '25', true, 'www.luna-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Max', '2021-07-30', 'bulldog', '18', false, 'www.max-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Bella', '2020-04-10', 'beagle', '10', true, 'www.bella-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Charlie', '2019-08-22', 'golden retriever', '30', true, 'www.charlie-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Rocky', '2021-12-05', 'boxer', '28', false, 'www.rocky-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Molly', '2022-02-18', 'dachshund', '7', true, 'www.molly-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Daisy', '2020-09-14', 'poodle', '8', true, 'www.daisy-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Toby', '2023-01-02', 'chihuahua', '2', false, 'www.toby-foto.jpg');
INSERT INTO mascota (nombre, fecha_nac, raza, peso, tiene_chip, url_foto) VALUES ('Coco', '2022-05-29', 'shih tzu', '6', true, 'www.coco-foto.jpg');
