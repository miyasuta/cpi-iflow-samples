# cpi-iflow-samples

Push target for Cloud Integration Git Access. Holds sample iFlows and their change history.

Skill repository: https://github.com/miyasuta/cpi-iflow-skill

## Samples and sandbox

- **Samples**: the iFlows on the `main` branch (for example `S01_ContentModifier`). Each sample is built in the Cloud Integration UI, one UI operation per commit, so the history of `main` shows how each UI change maps to the `.iflw` XML.
- **Sandbox (not a sample)**: the `X01_Sandbox` iFlow and the `exp` branch are used for experiments and for evaluating the skill. Their content includes intentionally broken or unusual states (for example unescaped values, missing diagram information, invalid coordinates, and old component versions). Do not use them as reference samples.
