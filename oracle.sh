docker run -d --name tender_taussig -p 1521:1521 -e ORACLE_PASSWORD=admin -v oracle-volume:/opt/oracle/oradata gvenzl/oracle-xe
