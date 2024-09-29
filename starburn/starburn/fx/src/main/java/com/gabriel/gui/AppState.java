package com.gabriel.gui;

import lombok.Data;

import java.util.Map;

@Data
public class AppState    {
    String filename;
    int selectedModel;
    Map<Object, Model> model;
}
