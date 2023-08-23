# minidock
Dockerized Spring REST API + MySQL
<br>
<h3> HOW TO RUN: </h3>
<ol>
    <li>docker compose build</li>
    <li>docker compose up</li>
    <li>base domain URL: localhost:8080</li>
</ol>

<h3>Endpoints:</h3>
<ol>
<li>"/tree"  <b> GET </b></li>
<li>"/tree/{id}" <b> GET/DELETE </b></li>
<li>"/tree/new" <b> POST </b> (accepts JSON payload)</li>
</ol>