CREATE TABLE IF NOT EXISTS user (
    user_pk BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(250) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    password_hash VARCHAR(250) NOT NULL,
    user_type VARCHAR(255) NOT NULL,
    user_status VARCHAR(10) NOT NULL DEFAULT 'ACTIVE',
    home_doctor_pk BIGINT NOT NULL,
    CONSTRAINT fk_user_home_doctor FOREIGN KEY (home_doctor_pk) REFERENCES home_doctor (home_doctor_pk)
);

INSERT INTO user (name, address, email, phone, password_hash, user_type, home_doctor_pk) VALUES
('Aleksandrs K.', 'Jurmala', 'kozirevs@inbox.lv', '+371 23456789', '0000', 'PATIENT', 3),
('Dmitrijs L.', 'Riga', 'dmitrijs@inbox.lv', '+371 23789789', '0000', 'DOCTOR', 1),
('Andrejs J.', 'Jelgava', 'andrejs@inbox.lv', '+371 22346789', '0000', 'PATIENT', 2),
('Julija M.', 'Ogre', 'julija@inbox.lv', '+371 23476589', '0000', 'PATIENT', 4),
('Mihails S.', 'Riga', 'mihails@inbox.lv', '+371 25436789', '0000', 'PATIENT', 5),
('Jurijs K.', 'Jurmala', 'jurijs@inbox.lv', '+371 28956789', '0000', 'PATIENT', 3);
