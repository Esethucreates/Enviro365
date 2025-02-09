# The Enviro365 application 

## Features

1. Waste Categories: Manage different types of waste categories.

2. Disposal Guidelines: Store and retrieve proper waste disposal methods.

3. Recycling Tips: Provide information on how to recycle waste efficiently.

4. Global Exception Handling: Handles validation errors, incorrect data inputs, and path mismatches.

## API endpoints

__Use localhost:8080/__

### Waste Categories

- Get all categories: GET /api/categories

- Get category by ID: GET /api/categories/{id}

- Create category: POST /api/categories

- Update category: PUT /api/categories/{id}

- Delete category: DELETE /api/categories/{id}

### Disposal Guidelines

- Get all guidelines: GET /api/guidelines

- Get guideline by ID: GET /api/guidelines/{id}

- Create guideline: POST /api/guidelines

- Update guideline: PUT /api/guidelines/{id}

- Delete guideline: DELETE /api/guidelines/{id}

### Recycling Tips

- Get all tips: GET /api/tips

- Get tip by ID: GET /api/tips/{id}

- Create tip: POST /api/tips

- Update tip: PUT /api/tips/{id}

- Delete tip: DELETE /api/tips/{id}

## Sample data to test
### -- Insert waste categories

INSERT INTO waste_category (category_name, description, common_examples) VALUES
('Plastic', 'Non-biodegradable synthetic materials.', 'Bottles, Bags, Containers'),
('Glass', 'Recyclable material made from melted silica.', 'Bottles, Jars, Windows'),
('Metal', 'Recyclable material used in construction.', 'Cans, Pipes, Tools');


### -- Insert disposal guidelines
INSERT INTO disposal_guidelines (title, description, waste_catid, instructions) VALUES
('Plastic Disposal', 'Plastics should be rinsed and placed in recycling bins.', 1, 'Separate by type, rinse, and place in blue bins.'),
('Glass Recycling', 'Glass can be reused or melted down for new products.', 2, 'Rinse, remove caps, and place in green bins.'),
('Metal Recycling', 'Metals should be sorted and sent to recycling plants.', 3, 'Clean, separate by type, and send to a scrapyard.');

### -- Insert recycling tips
INSERT INTO recycling_tips (title, description, waste_catid, environmental_impact_rating) VALUES
('Reduce Plastic Waste', 'Use reusable bottles and bags instead of plastic.', 1, 'High Impact'),
('Glass Repurposing', 'Turn glass bottles into decorative items.', 2, 'Medium Impact'),
('Scrap Metal Collection', 'Sell scrap metal to recyclers to reduce waste.', 3, 'High Impact');


