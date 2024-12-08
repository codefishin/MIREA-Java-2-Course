### Пример правильного ввода
```
http://localhost:2626/convert?value=100&from=meters&to=kilometers
```
### Пример ошибки 400 (неверный ввод)
```
http://localhost:2626/convert
http://localhost:2626/convert?value=10
http://localhost:2626/convert?value=10&from=TEST&to=kilometers
```
### Пример ошибки 404 (нету такой страницы)
```
http://localhost:2626/hahaha
```
