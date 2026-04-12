def call() {
    echo "Installing dependencies..."
    bat 'npm install'

    echo "Building project..."
    bat 'npm run build'
}