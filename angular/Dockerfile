FROM node:alpine AS builder

# installe un simple serveur http pour servir un contenu statique
RUN npm install -g http-server

WORKDIR /app

COPY . .

RUN npm install && \
    npm run build

EXPOSE 8080
CMD [ "http-server", "dist" ]
