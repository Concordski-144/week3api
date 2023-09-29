# week3api
Week 3 Exploring APIs

## 1. Description of Problem Domain:  
Public transit service update app

## 2. Description of application:  
An app that allows the user to select a subway station/transit stop within UTSG and obtain information
about their commute. The app will have a GUI with a map of the campus where the user can select the
transit stop closest to them.

### 3. Features:
- departure times for routes serving the selected stop
- live service alerts (delays)
- optimal station depending on user location

## 4. API Documentation
https://myttc.ca/developers

## 5. API Call Sample
![API Call Sample](https://github.com/Concordski-144/week3api/blob/main/spadina_station_api.png)

## 6. Example Code Output
```
Response{protocol=h2, code=200, message=, url=https://myttc.ca/spadina_station.json}  
Spadina Station
```



*run ttc_api.java for details* 

## 7. Potential Technical Problems
- API rate limit
- Unexpected API change
- Poor/Minimal API documentation
- Paid API access