![](https://github.com/sabrinaceciliajeria-cmyk/RefugioAnimales/raw/main/screenshot-1775781823.png)
# 🚚 Sistema de Vehículos de Reparto

Sistema de consola desarrollado en Java para gestionar vehículos de reparto de una empresa logística. Proyecto grupal orientado a la práctica de Programación Orientada a Objetos (POO).

---

## 🎯 Objetivo

Construir un sistema funcional que permita registrar, consultar y gestionar distintos tipos de vehículos, aplicando los pilares fundamentales de POO.

---

## 🧠 Conceptos POO aplicados

- **Encapsulación** — atributos privados con getters, setters y validaciones
- **Herencia** — clases hijas que extienden de una clase base `Vehiculo`
- **Polimorfismo** — sobrescritura del método `mostrarDetalle()` en cada subclase

---

## 🏗️ Estructura del proyecto

```
vehiculos-reparto/
│
├── src/
│   ├── Main.java          # Menú principal, Scanner, lógica de navegación
│   ├── Vehiculo.java      # Clase base con atributos comunes
│   ├── Camion.java        # Subclase con atributo: número de ejes
│   ├── Furgon.java        # Subclase con atributo: volumen interior
│   └── MotoReparto.java   # Subclase con atributo: caja térmica
│
├── README.md
└── .gitignore
```

---

## 📋 Funcionalidades

| Opción | Descripción |
|--------|-------------|
| 1 | Registrar camión |
| 2 | Registrar furgón |
| 3 | Registrar moto de reparto |
| 4 | Mostrar todos los vehículos |
| 5 | Mostrar vehículos disponibles |
| 6 | Marcar vehículo como no disponible |
| 7 | Mostrar reporte general |
| 8 | Salir |

---

## ✅ Validaciones implementadas

- No se permiten patentes vacías ni duplicadas
- No se permiten campos vacíos
- No se permiten capacidades o volúmenes negativos
- El programa no se rompe ante entradas inválidas

---

## ▶️ Cómo ejecutar

### Requisitos
- Java JDK 17 o superior
- Terminal / consola

### Pasos

```bash
# 1. Clonar el repositorio
git clone https://github.com/tu-usuario/vehiculos-reparto.git

# 2. Ingresar al directorio
cd vehiculos-reparto/src

# 3. Compilar
javac *.java

# 4. Ejecutar
java Main
```

---

## 🖥️ Ejemplo de uso

```
=== SISTEMA DE VEHÍCULOS DE REPARTO ===
1. Registrar camión
2. Registrar furgón
3. Registrar moto de reparto
4. Mostrar todos los vehículos
5. Mostrar vehículos disponibles
6. Marcar vehículo como no disponible
7. Mostrar reporte general
8. Salir

Seleccione una opción: 1

--- Registrar Camión ---
Ingrese patente: ABC123
Ingrese marca: Volvo
Ingrese modelo: FH16
Ingrese capacidad de carga (ton): 20
Ingrese número de ejes: 3

✅ Camión registrado correctamente.
```

---

## 🌿 Flujo de trabajo (Git)

Este proyecto usa **forks**. Cada integrante trabaja en su propio fork y envía Pull Requests a la rama `develop` del repositorio principal.

```
Fork personal → trabajo local → PR a develop → revisión → merge
                                                          ↓
                                                       main (entrega final)
```

### Ramas del repo principal

| Rama | Propósito |
|------|-----------|
| `main` | Código estable, versión final de entrega |
| `develop` | Integración del trabajo de todos los integrantes |

---

## 👥 Integrantes

| Integrante | Responsabilidad |
|------------|-----------------|
| Diego Peña | Arquitectura, integración, gestión del repo |
| Manuel Labrador | Clase `Vehiculo` — encapsulación y validaciones |
| Natalia Medel | Clase `Camion` — herencia y polimorfismo |
| Cristian | Clase `Furgon` — herencia y polimorfismo |
| Cristopher | Clase `MotoReparto` — herencia y polimorfismo |
| Arantxa Fischr | `Main` — menú, Scanner, registro de vehículos |
| Sabrina Jeria | `Main` — consultas, reporte, validaciones de entrada |

---

## 📄 Licencia

Proyecto educativo — Challenger Grupal

---
