CREATE TABLE IF NOT EXISTS home_doctor (
    home_doctor_pk BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    external_reference VARCHAR(50) NOT NULL,
    phone VARCHAR(200) NOT NULL
);

INSERT INTO home_doctor (name, external_reference, phone) VALUES
('Irina R.', 'RF246434543', '+371 23456789'),
('Dmitrijs L.', 'RF246567543', '+371 23764789'),
('Aleksandrs K.', 'RF246434243', '+371 24566789'),
('Andrejs J.', 'RF246456543', '+371 34556789'),
('Julija M.', 'RF246434543', '+371 23765789');
