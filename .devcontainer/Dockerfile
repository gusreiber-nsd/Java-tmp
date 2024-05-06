FROM mcr.microsoft.com/devcontainers/java:1-21

# Install xvfb
RUN apt-get update && apt-get install -y xvfb

# Set up environment variables for display
ENV DISPLAY=:99
