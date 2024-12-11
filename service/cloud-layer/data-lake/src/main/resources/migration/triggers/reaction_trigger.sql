CREATE TRIGGER reaction_after_insert
AFTER INSERT ON reaction_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('reaction_table', 'INSERT', NEW.reaction_id, NOW());
END;

CREATE TRIGGER reaction_after_update
AFTER UPDATE ON reaction
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('reaction_table', 'UPDATE', NEW.reaction_id, NOW());
END;

CREATE TRIGGER reaction_after_delete
AFTER DELETE ON reaction_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('reaction_table', 'DELETE', OLD.reaction_id, NOW());
END;