# GardenGuard

**Benutzer**, **Person**,
**Garten**, **Pflanzen** und **Gartenbereiche**.

### Klasse Person
- Eine **Person** hat einen *Benutzernamen*, ein *Passwort* und eine *E-Mail-Adresse*.
  
### Klasse Benutzer
- Ein **Benutzer** ist eine **Person**.
- Ein **Benutzer** hat einen oder mehere **Garten**.

### Klasse Garten
- Ein **Garten** hat **Gartenbereiche**.

### Klasse Gartenbereich
- Ein **Gartenbereich** hat einen *Namen*, eine *Beschreibung* und eine Liste von zugeordneten **Pflanzen**.

### Klasse Pflanze
- Eine **Pflanze** ist ein Element im Garten.
- Eine **Pflanze** hat einen *Namen*, eine *Pflanzenart*, einen *Standort* und einen *Bewässerungsbedarf*.

### Funktionen
- **Benutzer** können mehrere **Gartenbereiche** erstellen und verwalten.
- **Benutzer** können ihre **Pflanzen** in den **Gartenbereichen** überwachen.
- **Benutzer** können den *Bewässerungsstatus* der **Pflanzen** einsehen und die *Bewässerung* ferngesteuert aktivieren.
