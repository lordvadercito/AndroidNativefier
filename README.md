# Android Nativifier
_Convierte una aplicación web en una aplicación Android nativa fácilmente_

## Comenzando 🚀
Sólo copia este repositorio :)
Y asegurate de que tu web app sea 100% responsive

## Detalles 📋

_Mínima SDK: 23_

_SDK compilada: 28_

## Configuración 🔧
Para una configuración mínima solo busca los TODO's
```
//TODO: Your app URL
mWebView.loadUrl("https:agustinducca.com");
```
En ella ingresa la URL de la app que quieras "nativificar"


En el caso de que tu aplicación requiera autenticación desde el navegador, busca el TODO:
```
//TODO: Authentication
        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
                handler.proceed("User", "pass");
```
Y reemplaza el user y contraseña por tus credenciales

## Construido con 🛠️

Android Studio 3.2.1

Build #AI-181.5540.7.32.5056338, built on October 8, 2018

JRE: 1.8.0_152-release-1136-b06 amd64

JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o

Windows 10 10.0

## Versionado 📌
Versión 1.0

## Autor ✒️
Agustín Ducca (https://agustinducca.com)



## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢

* Invitame un café ☕.

* Da las gracias públicamente 🤓.

* Dame una buena recomendacion en LinkedIn 💬 (https://www.linkedin.com/in/agustin-ducca-pantaleon/).

⌨️ con ❤️ por @lordvadercito 😊
