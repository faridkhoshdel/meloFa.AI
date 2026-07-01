const express = require('express');
const cors = require('cors');
require('dotenv').config();

const app = express();
const PORT = process.env.PORT || 5000;

// Middleware
app.use(cors());
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Health Check
app.get('/health', (req, res) => {
  res.json({
    status: 'ok',
    message: 'meloFa.AI Backend is running',
    timestamp: new Date().toISOString(),
  });
});

// API Routes
app.get('/api/v1/ping', (req, res) => {
  res.json({ message: 'pong' });
});

// 404 Handler
app.use((req, res) => {
  res.status(404).json({
    success: false,
    message: 'Route not found',
    path: req.path,
  });
});

// Error Handler
app.use((err, req, res, next) => {
  console.error('Error:', err);
  res.status(500).json({
    success: false,
    message: 'Internal Server Error',
    error: process.env.NODE_ENV === 'development' ? err.message : undefined,
  });
});

// Start Server
app.listen(PORT, () => {
  console.log(`
╔════════════════════════════════════════╗
║  🚀 meloFa.AI Backend API             ║
║  Server running on port ${PORT}        ║
║  Environment: ${process.env.NODE_ENV || 'development'}          ║
║  Health Check: http://localhost:${PORT}/health ║
╚════════════════════════════════════════╝
  `);
});

module.exports = app;
