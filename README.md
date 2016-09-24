

Object to configure service from the client: 

```
{
    start_time: 1474680122236,
    running: true,
	duration: 90,
	temperature: 155.0,
	scale: "c"
}
```

Object to log temp data:

```
{
    cookDuration: 90,
	fromTime: 1474680121236,
	toTime: 1474680122236,
	tempLog: [{
		
		tempValue: 155.0,
		tempScale: "c",
		time: 1474680122236
	}, {
		
		tempValue: 155.0,
		tempScale: "c",
		time: 1474680121236
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

One demo endpoint exists 

https://sousvide.lyth.io/api/configuration