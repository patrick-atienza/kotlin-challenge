INSERT INTO patients(id, `name`, `email`, `pass`)
VALUES
  (1, 'Leif Weyand', 'l.weyand@gmail.com', '{bcrypt}$2a$10$axwgMyHpzJpe1PzIdYzmnOTSlkC/oEO2cBMqrT.y9gQ6IsF/GnEge'),
  (2, 'Claris Blackford', 'c.blackford@gmail.com', '{bcrypt}$2a$10$LGjB8oBUTsml.V9paL0h0ut0bcCyqG73U/v6/eFzOh4vfBmxjEHC.'),
  (3, 'Lessie Grear', 'l.grear@gmail.com', '{bcrypt}$2a$10$LGjB8oBUTsml.V9paL0h0ut0bcCyqG73U/v6/eFzOh4vfBmxjEHC.'),
  (4, 'Reyes Callaghan', 'r.callaghan@gmail.com', '{bcrypt}$2a$10$LGjB8oBUTsml.V9paL0h0ut0bcCyqG73U/v6/eFzOh4vfBmxjEHC.'),
  (5, 'Herb Relyea', 'h.relyea@gmail.com', '{bcrypt}$2a$10$LGjB8oBUTsml.V9paL0h0ut0bcCyqG73U/v6/eFzOh4vfBmxjEHC.'),
  (6, 'Gale Klingenberg', 'g.klingenberg@gmail.com', '{bcrypt}$2a$10$LGjB8oBUTsml.V9paL0h0ut0bcCyqG73U/v6/eFzOh4vfBmxjEHC.'),
  (7, 'Margene Lore', 'm.lore@gmail.com', '{bcrypt}$2a$10$axwgMyHpzJpe1PzIdYzmnOTSlkC/oEO2cBMqrT.y9gQ6IsF/GnEge'),
  (8, 'Demarcus Glassford', 'd.glassford@gmail.com', '{bcrypt}$2a$10$LGjB8oBUTsml.V9paL0h0ut0bcCyqG73U/v6/eFzOh4vfBmxjEHC.'),
  (9, 'Anamaria Manthe', 'a.manthe@gmail.com', '{bcrypt}$2a$10$LGjB8oBUTsml.V9paL0h0ut0bcCyqG73U/v6/eFzOh4vfBmxjEHC.'),
  (10, 'Farrah Lanphere', 'f.lanphere@gmail.com', '{bcrypt}$2a$10$LGjB8oBUTsml.V9paL0h0ut0bcCyqG73U/v6/eFzOh4vfBmxjEHC.');

INSERT INTO hospitals(id, `name`)
VALUES
  (1, 'Flowerhill General Hospital'),
  (2, 'Tranquil Valley Community Hospital'),
  (3, 'Paradise Grove Hospital Center'),
  (4, 'Principal Community Hospital'),
  (5, 'Bayhealth General Hospital'),
  (6, 'Lilypad Medical Clinic'),
  (7, 'White Blossom Clinic');

INSERT INTO visits(hospital_id, patient_id, date)
VALUES
    (1, 1, NOW() + RAND()),
    (1, 1, NOW() + RAND()),
    (1, 1, NOW() + RAND()),
    (1, 1, NOW() + RAND()),
    (1, 2, NOW() + RAND()),
    (1, 3, NOW() + RAND()),
    (1, 3, NOW() + RAND()),
    (1, 5, NOW() + RAND()),
    (1, 5, NOW() + RAND()),
    (1, 6, NOW() + RAND()),
    (1, 6, NOW() + RAND()),
    (1, 6, NOW() + RAND()),
    (1, 7, NOW() + RAND()),
    (1, 9, NOW() + RAND()),
    (1, 9, NOW() + RAND()),
    (1, 10, NOW() + RAND()),
    (2, 3, NOW() + RAND()),
    (2, 3, NOW() + RAND()),
    (2, 4, NOW() + RAND()),
    (2, 4, NOW() + RAND()),
    (2, 4, NOW() + RAND()),
    (2, 4, NOW() + RAND()),
    (2, 5, NOW() + RAND()),
    (2, 5, NOW() + RAND()),
    (2, 5, NOW() + RAND()),
    (2, 6, NOW() + RAND()),
    (2, 7, NOW() + RAND()),
    (2, 7, NOW() + RAND()),
    (2, 7, NOW() + RAND()),
    (2, 8, NOW() + RAND()),
    (2, 10, NOW() + RAND()),
    (2, 10, NOW() + RAND()),
    (2, 10, NOW() + RAND()),
    (2, 10, NOW() + RAND()),
    (2, 10, NOW() + RAND()),
    (2, 10, NOW() + RAND()),
    (2, 10, NOW() + RAND()),
    (2, 10, NOW() + RAND()),
    (3, 2, NOW() + RAND()),
    (3, 2, NOW() + RAND()),
    (3, 2, NOW() + RAND()),
    (3, 2, NOW() + RAND()),
    (3, 2, NOW() + RAND()),
    (3, 3, NOW() + RAND()),
    (3, 3, NOW() + RAND()),
    (3, 5, NOW() + RAND()),
    (3, 5, NOW() + RAND()),
    (3, 5, NOW() + RAND()),
    (3, 5, NOW() + RAND()),
    (3, 6, NOW() + RAND()),
    (3, 7, NOW() + RAND()),
    (3, 7, NOW() + RAND()),
    (3, 7, NOW() + RAND()),
    (3, 8, NOW() + RAND()),
    (3, 8, NOW() + RAND()),
    (3, 8, NOW() + RAND()),
    (3, 8, NOW() + RAND()),
    (3, 8, NOW() + RAND()),
    (3, 8, NOW() + RAND()),
    (4, 1, NOW() + RAND()),
    (4, 1, NOW() + RAND()),
    (4, 1, NOW() + RAND()),
    (4, 2, NOW() + RAND()),
    (4, 3, NOW() + RAND()),
    (4, 3, NOW() + RAND()),
    (4, 4, NOW() + RAND()),
    (4, 4, NOW() + RAND()),
    (4, 4, NOW() + RAND()),
    (4, 4, NOW() + RAND()),
    (4, 4, NOW() + RAND()),
    (4, 4, NOW() + RAND()),
    (4, 4, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 5, NOW() + RAND()),
    (4, 8, NOW() + RAND()),
    (4, 8, NOW() + RAND()),
    (4, 8, NOW() + RAND()),
    (4, 10, NOW() + RAND()),
    (4, 10, NOW() + RAND()),
    (5, 1, NOW() + RAND()),
    (5, 1, NOW() + RAND()),
    (5, 1, NOW() + RAND()),
    (5, 1, NOW() + RAND()),
    (5, 1, NOW() + RAND()),
    (5, 1, NOW() + RAND()),
    (5, 2, NOW() + RAND()),
    (5, 2, NOW() + RAND()),
    (5, 2, NOW() + RAND()),
    (5, 3, NOW() + RAND()),
    (5, 6, NOW() + RAND()),
    (5, 6, NOW() + RAND()),
    (5, 6, NOW() + RAND()),
    (5, 6, NOW() + RAND()),
    (5, 7, NOW() + RAND()),
    (5, 7, NOW() + RAND()),
    (5, 7, NOW() + RAND()),
    (5, 8, NOW() + RAND()),
    (5, 8, NOW() + RAND()),
    (5, 8, NOW() + RAND()),
    (5, 8, NOW() + RAND()),
    (5, 8, NOW() + RAND()),
    (5, 9, NOW() + RAND()),
    (5, 9, NOW() + RAND()),
    (6, 1, NOW() + RAND()),
    (6, 1, NOW() + RAND()),
    (6, 1, NOW() + RAND()),
    (6, 1, NOW() + RAND()),
    (6, 1, NOW() + RAND()),
    (6, 1, NOW() + RAND()),
    (6, 6, NOW() + RAND()),
    (6, 6, NOW() + RAND()),
    (6, 6, NOW() + RAND()),
    (6, 7, NOW() + RAND()),
    (6, 7, NOW() + RAND()),
    (6, 8, NOW() + RAND()),
    (6, 9, NOW() + RAND()),
    (6, 9, NOW() + RAND()),
    (6, 9, NOW() + RAND()),
    (6, 9, NOW() + RAND()),
    (6, 9, NOW() + RAND()),
    (6, 9, NOW() + RAND()),
    (6, 9, NOW() + RAND()),
    (6, 10, NOW() + RAND()),
    (6, 10, NOW() + RAND()),
    (7, 2, NOW() + RAND()),
    (7, 2, NOW() + RAND()),
    (7, 2, NOW() + RAND()),
    (7, 2, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 4, NOW() + RAND()),
    (7, 10, NOW() + RAND()),
    (7, 10, NOW() + RAND()),
    (7, 10, NOW() + RAND()),
    (7, 10, NOW() + RAND()),
    (7, 10, NOW() + RAND()),
    (7, 10, NOW() + RAND());
