DELIMITER $$

CREATE TRIGGER date_time_after_insert
AFTER INSERT ON date_time_table_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('date_time_table', 'INSERT', OLD.id);
END$$

CREATE TRIGGER date_time_after_update
AFTER UPDATE ON date_time_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('date_time_table', 'UPDATE', OLD.id);
END$$

CREATE TRIGGER date_time_after_delete
AFTER DELETE ON date_time_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('date_time_table', 'DELETE', OLD.id);
END$$

DELIMITER ;