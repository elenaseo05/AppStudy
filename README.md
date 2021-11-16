# AppStudy
android and ios app study repository

앱 A에서 앱 B로 전환 하는 방법 중 하나인 scheme을 사용하여 딥링크를 사용하여 구현 하였다. 

### AppA_to_AppB
------------------------------------

how to move from AppA to AppB

#### in Android
[android](https://github.com/elenaseo05/AppStudy/tree/main/AppA_to_AppB/android)
Scheme을 사용하여 앱 간 전환이 가능하다. 

형식 
scheme://host

intent로 앱간 전환이 가능하다. 

#### in IOS
[ios](https://github.com/elenaseo05/AppStudy/tree/main/AppA_to_AppB/ios)
Scheme을 사용하여 앱 간 전환이 가능하다. 

형식 
scheme://

info.plist 에 
LSApplicationQueriesSchemes 아래 
item 을 추가 하고, 전환 할 app의 scheme을 입력한다. 



