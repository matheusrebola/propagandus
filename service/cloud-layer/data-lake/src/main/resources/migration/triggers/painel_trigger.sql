DELIMITER $$

CREATE TRIGGER painel_after_insert
AFTER INSERT ON painel_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('painel_table', 'INSERT', OLD.id);
END$$

CREATE TRIGGER painel_after_update
AFTER UPDATE ON painel_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('painel_table', 'UPDATE', OLD.id);
END$$

CREATE TRIGGER painel_after_delete
AFTER DELETE ON painel_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('painel_table', 'DELETE', OLD.id);
END$$

DELIMITER ;