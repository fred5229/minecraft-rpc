echo "compiling ..."

mvn compile && mvn package && python -m grpc_tools.protoc -I=src/main/proto --python_out=clients/python --grpc_python_out=clients/python minecraft.proto && echo "finished compiling" && cp target/minecraft-rpc-0.0.5.jar server/mods

