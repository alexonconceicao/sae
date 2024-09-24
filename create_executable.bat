@echo off
mkdir executables
jpackage --name "SAE - Escola Criativa" --input . --main-jar RegSchool.jar --icon ..\icons\logo_criativa.ico --type exe --win-menu --win-shortcut --description "Aplicativo MVP para gerenciamento escolar da SAE - Escola Criativa." --app-version "1.0" --output ./executables/