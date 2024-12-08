DELIMITER $$

CREATE TRIGGER reaction_after_insert
AFTER INSERT ON reaction_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('reaction_table', 'INSERT', OLD.id);
END$$

CREATE TRIGGER reaction_after_update
AFTER UPDATE ON reaction
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('reaction_table', 'UPDATE', OLD.id);
END$$

CREATE TRIGGER reaction_after_delete
AFTER DELETE ON reaction_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('reaction_table', 'DELETE', OLD.id);
END$$

DELIMITER ;