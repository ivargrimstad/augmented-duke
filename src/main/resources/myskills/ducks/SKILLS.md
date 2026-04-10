---
name: duck-breeds
description: Technical specifications and habitat requirements for various duck breeds. Use this to optimize waterfowl deployments for egg production, pest control, or aesthetic gardening.
---

# Duck Breed Specifications

This skill provides the data necessary to manage different waterfowl "models." Use these guidelines to ensure proper pond-to-land ratios and forage efficiency.

## Breed Classifications & Hardware Specs

| Breed | Weight Class | Primary Function | Egg Yield | Temperament |
| :--- | :--- | :--- | :--- | :--- |
| **Pekin** | Heavy | Multi-purpose / Meat | High (White) | Docile / Social |
| **Indian Runner** | Light | Pest Control / Eggs | Very High | High-Alert / Upright |
| **Muscovy** | Heavy | Silent Foraging | Medium | Independent / Quiet |
| **Khaki Campbell** | Medium | Egg Production | Extreme (300+) | Nervous / Active |
| **Call Duck** | Bantam | Aesthetic / Decoy | Low | Very Vocal / Friendly |
| **Cayuga** | Medium | Ornamental / Meat | Medium (Black) | Calm / Hardy |

## Environmental Requirements

### 1. The Upright Chassis (Indian Runner)
* **Posture:** Unique 45-to-75 degree vertical stance.
* **Mobility:** Built for running rather than waddling. 
* **Deployment:** Best used in vineyards or gardens for `slug_eradication` tasks. They do not require deep water but need space to patrol.

### 2. Silent Mode Operations (Muscovy)
* **Vocalization:** Replaces the standard `quack.mp3` with a low-volume hiss.
* **Climbing:** Equipped with sharp claws for perching; ensure coop roofs are secure.
* **Note:** This is technically a different species (Cairina moschata) but remains compatible with the Duck API.

### 3. High-Yield Egg Production (Khaki Campbell)
* **Optimization:** Designed for maximum output. Requires high-protein fuel (16-18% layer feed).
* **Environment:** Keep stress levels low to prevent a `production_drop` event.

## Troubleshooting Common Waterfowl Issues

### Issue: `excessive_quacking`
* **Common in:** Female Call Ducks and Pekins.
* **Diagnosis:** Often triggered by a "Missing Human" event or "Hunger" status.
* **Fix:** Check feeder levels or provide a secondary duck unit for social stability.

### Issue: `mud_patch_creation`
* **Status:** Expected behavior. Ducks will transform any water source into a mud-based environment.
* **Mitigation:** Implement gravel-heavy drainage around the "Splash Zone."

## Best Practices
* **Water Access:** While not all breeds are heavy swimmers, all require enough water depth to submerge their heads to clear their `sinus_valves`.
* **Predator Defense:** Nighttime housing must be "Hardware Cloth" reinforced. Standard chicken wire is insufficient against `raccoon_exploit`.
* **Social Pairing:** Minimum deployment is **2 units**. Solo ducks will experience `loneliness_latency` and system failure.

---
*Generated for the Waterfowl Agent Integration Framework.*
