

Object to configure service from the client: 

`https://sousvide.lyth.io/api/configuration`

```
{
    start_time: 1474680122236,
    running: true,
	duration: 90,
	temperature: 55.0
}
```

Object to log temp data:

`https://sousvide.lyth.io/api/logs`

```
{
	logs: [{
		temperature: 155.0,
		timestamp: 1474680122236
	}, {
		
		temperature: 155.0,
		timestamp: 1474680121236
	}]
}
```

To deploy:

local
```
mvn package
scp target/sousvide-api.jar sous-vide-api:
```

remote
```
sudo cp sousvide-api.jar /var/sousvide/sousvide-api.jar
sudo systemctl restart sousvide
```

