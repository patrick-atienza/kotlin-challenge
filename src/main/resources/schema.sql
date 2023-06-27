-- Feel free to augment or modify these schemas (and the corresponding data) as you see fit!
DROP TABLE IF EXISTS patients CASCADE;
DROP TABLE IF EXISTS hospitals CASCADE;
DROP TABLE IF EXISTS visits CASCADE;

CREATE TABLE patients (
  id IDENTITY,
  name  VARCHAR NOT NULL,
  email VARCHAR NOT NULL UNIQUE,
  pass  VARCHAR NOT NULL
);
CREATE TABLE hospitals (
  id IDENTITY,
  name VARCHAR NOT NULL
);
CREATE TABLE visits (
  id IDENTITY,
  hospital_id NUMBER,
  patient_id NUMBER,
  date TIMESTAMP(0)
);
