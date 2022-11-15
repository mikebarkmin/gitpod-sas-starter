FROM gitpod/workspace-full-vnc:latest

USER gitpod

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 8.0.345-zulu && \
    sdk default java 8.0.345-zulu"
