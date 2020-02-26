set projectLocation=D:\New folder\Test
cd %projectLocation%
set classpath=%projectLocation%\bin;D:\ECLPGM\Jars\*;
java org.testng.TestNG testng.xml
pause