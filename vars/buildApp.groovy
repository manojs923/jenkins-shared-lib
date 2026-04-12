def call() {
    echo "Installing dependencies..."
    sh 'npm install'

    echo "Building project..."
    sh 'npm run build'
}