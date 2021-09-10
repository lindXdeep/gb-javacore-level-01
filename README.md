# Home work 2.08:

Разобраться с кодом.

1. Добавить отключение неавторизованных пользователей по таймауту (120 сек. ждём после подключения клиента, и если он не авторизовался за это время, закрываем соединение).
   
2. ** Сделать на клиенте регистрацию
   
3. ** Кто хочет углубиться в тему JavaFX - поправить интерфейс: отступы, цвета, шрифты. Если что, оно работает и с css.

## &#9000; Changes:

### &#128296; Features:

- server:
  - You may to run the server on a different port, for example: `java -jar server.jar <port>`
  - Logging to the console of connection events
  - Connect users in separate Threads.
  - Searching for a free port if the port is busy
  - Asymmetric message encryption
  - Data transfer protocol
  - Automatically log into the account if the user is authorized
  - Sending credentials to the mail
  - Registration via mail
  - Passwords are stored in a hash
  - User accounts
  - Command processing
  - status brodcasting: online / offline

- client:
  - You can connect by choosing any port and address: `java -jar client.jar --connect 127.0.0.1 8181`.
  - Waiting for a connection if the server is not available.
  - Command module:
     1. `/signin`                 - Authentication
     2. `/sigup`                  - Authorization
     3. `/status`                 - Сurrent status
     4. `/connect`                - Try connect to the server using last address: [127.0.0.1:8181] 
     5. `/connect <PORT>`         - Try connect to the server using custom port
     6. `/disconnect`             - Disconnect from the Server
     7. `/reconnect`              - Reconnect to the Server
     8. `/logout`                 - Logout from the user account
     9. `/exit`                   - Exit from the Talx
    1.  `/help`                   - Help
    2.  `@<username> <message>`   - Send private message for user
    3.  `@all <message> `         - Sand public message for all contacts
    4.  `/online `                - Show online users
    5.  `/read <username>`        - read last 10 messages from `<username>`
    6.  `/read <username> <num>`  - read last `<num>` messages from `<username>`
  - Asymmetric message encryption
  - Data transfer secure protocol
  - Auto login after authentication
  - Messages are stored in the user folder

### &#128295; Bug Fixes:
