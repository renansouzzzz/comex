docker run -d --name oracle -p 1522:1521 -e ORACLE_PASSWORD=admin -v oracle-volume:/app gvenzl/oracle-xe
