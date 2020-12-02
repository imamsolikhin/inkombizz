# app="api_asset_noc"
# docker rm $(docker stop $(docker ps -a -q --filter ancestor=${app} --format="{{.ID}}"))
# docker build -t ${app} .
# docker run -i -d -p 8014:8014 --name=${app} -v $PWD:/app ${app}

docker-compose build
docker-compose up
docker ps
