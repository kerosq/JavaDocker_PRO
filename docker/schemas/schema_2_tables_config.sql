ALTER TABLE cuenta_usuario ALTER COLUMN created_on SET DEFAULT now();
ALTER TABLE cuenta_usuario ALTER COLUMN last_login SET DEFAULT now();