CREATE TRIGGER painel_after_insert
AFTER INSERT ON painel_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('painel_table', 'INSERT', NEW.painel_id, NOW());
END;

CREATE TRIGGER painel_after_update
AFTER UPDATE ON painel_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('painel_table', 'UPDATE', NEW.paienl_id, NOW());
END;

CREATE TRIGGER painel_after_delete
AFTER DELETE ON painel_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('painel_table', 'DELETE', OLD.painel_id, NOW());
END;