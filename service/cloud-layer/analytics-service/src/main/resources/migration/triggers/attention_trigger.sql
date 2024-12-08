DELIMITER $$

CREATE TRIGGER attention_after_insert
AFTER INSERT ON attention_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('attention_table', 'INSERT', OLD.id);
END$$

CREATE TRIGGER attention_after_update
AFTER UPDATE ON attention_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('attention_table', 'UPDATE', OLD.id);
END$$

CREATE TRIGGER attention_after_delete
AFTER DELETE ON attention_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('attention_table', 'DELETE', OLD.id);
END$$

DELIMITER ;