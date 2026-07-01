# meloFa.AI - Website Builder Platform

A modern, scalable, and conversion-focused platform combining a Next.js website with an Android app for AI-driven website creation (Wix-like builder).

## 🚀 Project Structure

```
meloFa.AI/
├── web/                    # Next.js Website
├── android/                # Android App (Java)
├── backend/                # Node.js/Express API
├── docs/                   # Documentation
└── docker-compose.yml      # Local development setup
```

## 📋 Features

### Website
- ✅ Dark/Light mode toggle with persistence
- ✅ Responsive design (Mobile-first)
- ✅ WCAG 2.1 AA Accessibility
- ✅ SEO optimized (Metadata, Schema.org)
- ✅ High performance (>90 Lighthouse score)
- ✅ Contact form with validation
- ✅ Newsletter signup
- ✅ Pricing calculator
- ✅ FAQ with accordion
- ✅ Testimonials carousel

### Android App
- ✅ Wix-like drag & drop builder
- ✅ Template library
- ✅ Real-time preview
- ✅ Material Design 3
- ✅ Dark/Light theme
- ✅ Authentication (JWT)
- ✅ Offline support (Room Database)

### Backend API
- ✅ User authentication & authorization
- ✅ Website template management
- ✅ Form submission handling
- ✅ Payment processing (Stripe)
- ✅ Email notifications
- ✅ Analytics tracking
- ✅ Rate limiting & security

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Website | Next.js 14, React 18, Tailwind CSS, TypeScript |
| Android | Java, Android SDK, Material Design 3, Retrofit |
| Backend | Node.js, Express, PostgreSQL, JWT Auth |
| DevOps | Docker, GitHub Actions, Vercel/Netlify |

## 📦 Quick Start

### Prerequisites
- Node.js 18+
- Java 11+
- Android Studio
- Docker & Docker Compose

### Website Setup
```bash
cd web
npm install
npm run dev
# Open http://localhost:3000
```

### Backend Setup
```bash
cd backend
npm install
npm run dev
# API runs on http://localhost:5000
```

### Android Setup
```bash
cd android
# Open in Android Studio
# Build & run on emulator
```

## 🔐 Environment Variables

Create `.env.local` in each directory (see `.env.example`):

**web/.env.local**
```
NEXT_PUBLIC_API_URL=http://localhost:5000
NEXT_PUBLIC_STRIPE_KEY=pk_test_...
```

**backend/.env**
```
DATABASE_URL=postgresql://user:pass@localhost:5432/melofaai
JWT_SECRET=your_jwt_secret
STRIPE_SECRET_KEY=sk_test_...
```

## 📊 Performance Targets

- ⚡ Lighthouse Performance: >90
- 🔒 Lighthouse Accessibility: >95
- 🔍 SEO Score: >95
- ⏱️ First Contentful Paint: <1.2s
- ⏱️ Largest Contentful Paint: <2s

## 🧪 Testing & Quality

```bash
# Website tests
cd web && npm run test

# Backend tests
cd backend && npm run test

# Linting & formatting
npm run lint
npm run format
```

## 🚢 Deployment

### Website (Vercel)
```bash
vercel deploy --prod
```

### Backend (Railway/Heroku)
```bash
# See backend/deploy.md
```

### Android (Google Play)
```bash
# See android/RELEASE.md
```

## 📚 Documentation

- [Website Setup Guide](./docs/WEBSITE_SETUP.md)
- [Android Development Guide](./docs/ANDROID_SETUP.md)
- [Backend API Documentation](./docs/API.md)
- [Deployment Guide](./docs/DEPLOYMENT.md)
- [Design System](./docs/DESIGN_SYSTEM.md)

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit changes (`git commit -m 'Add amazing feature'`)
4. Push to branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

MIT License - see LICENSE file

## 👨‍💻 Author

**Farid Khoshdel**
- GitHub: [@faridkhoshdel](https://github.com/faridkhoshdel)
- Email: contact@melofaai.com

## 🆘 Support

- 📧 Email: support@melofaai.com
- 💬 Discord: [Join Community](https://discord.gg/melofaai)
- 📖 Docs: [docs.melofaai.com](https://docs.melofaai.com)

---

**Built with ❤️ for creators and developers**
