CREATE TRIGGER painel_after_insert
AFTER INSERT ON painel_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('painel_table', 'INSERT', NEW.painel_id, NOW());
END;