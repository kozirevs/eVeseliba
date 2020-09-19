CREATE TABLE IF NOT EXISTS log (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date TIMESTAMP,
    method VARCHAR(10),
    url VARCHAR(2000),
    request_json VARCHAR(5000),
    request_ip_v6 VARCHAR(100),
    message VARCHAR(1000),
    result VARCHAR(30),
    environment VARCHAR(30)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;