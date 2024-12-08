DELIMITER $$

CREATE TRIGGER advertising_after_insert
AFTER INSERT ON advertising_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action)
    VALUES ('advertising_table', 'INSERT', NEW.id);
END$$

CREATE TRIGGER advertising_after_update
AFTER UPDATE ON advertising_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action)
    VALUES ('advertising_table', 'UPDATE', NEW.id);
END$$

CREATE TRIGGER avertising_after_delete
AFTER DELETE ON advertising_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('advertising', 'DELETE', OLD.id);
END$$

DELIMITER ;