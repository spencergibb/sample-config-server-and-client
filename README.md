# sample-config-server-and-client

1) start config server
2) start config client

## Httpie Commands

Shows what will be served from config server

```bash
http :8888/configclient/default
```

Shows the property received from config server

```bash
http :8080
```

Shows the config clients environment

```bash
http :8080/actuator/env
```