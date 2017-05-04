# Play framework image

An image that includes pre populated ivy repos for the base Play framework.


It uses an activator image to create a new plain and default Play application.

Then updates the play versions and builds the application and downloads the required libraries.
It then removes the actual application but preservers the ivy repositories.

