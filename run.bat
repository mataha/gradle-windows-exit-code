@if "%DEBUG%" == "" @echo off

call gradlew --quiet installDist &&^
call build\install\gradle-windows-exit-code\bin\gradle-windows-exit-code %*

echo Exit code: %ERRORLEVEL%
