package com.gabriel.gui;

public interface AppService {
    void Open();
    void save();
    void saveAs();
    void close();
    void newDoc();
    void exit();

    void undo();
    void redo();

    void cut();
    void paste();

    void insert(int x, int y);
}
