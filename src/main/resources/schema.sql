-- Feel free to augment or modify these schemas (and the corresponding data) as you see fit!
DROP TABLE IF EXISTS patients;
DROP TABLE IF EXISTS hospitals;
DROP TABLE IF EXISTS visits;

CREATE TABLE patients (
  id IDENTITY,
  name VARCHAR NOT NULL,
  pass CHAR(60)
);
CREATE TABLE hospitals (
  id IDENTITY,
  name VARCHAR NOT NULL
);
CREATE TABLE visits (
  id IDENTITY,
  hospital_id NUMBER,
  patient_id NUMBER
);