@if "%DEBUG%" == "" @echo off

call gradlew --quiet installDist
if %ERRORLEVEL% equ 0 build\install\gradle-windows-exit-code\bin\gradle-windows-exit-code %*
