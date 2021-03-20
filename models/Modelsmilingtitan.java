// Made with Blockbench 3.8.0
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsmilingtitan extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg_r1;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_r1;

	public Modelsmilingtitan() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -71.0F, 4.0F);
		head.setTextureOffset(0, 0).addBox(-16.0F, -33.0F, -14.0F, 32.0F, 32.0F, 32.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 64).addBox(-16.0F, -72.0F, -4.0F, 32.0F, 48.0F, 16.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(23.0F, -68.0F, 3.0F);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(-15.0F, 44.0F, 1.0F);
		left_arm.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, 3.1416F, 0.0F, 0.0F);
		left_arm_r1.setTextureOffset(168, 80).addBox(8.0F, 14.0F, -8.0F, 12.0F, 32.0F, 16.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-21.0F, -68.0F, 4.0F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(13.0F, 44.0F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, 3.1416F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(168, 80).addBox(-20.0F, 14.0F, -8.0F, 12.0F, 32.0F, 16.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(9.1F, -23.0F, 5.0F);

		left_leg_r1 = new ModelRenderer(this);
		left_leg_r1.setRotationPoint(-1.1F, -1.0F, 3.0F);
		left_leg.addChild(left_leg_r1);
		setRotationAngle(left_leg_r1, 3.1416F, 0.0F, 0.0F);
		left_leg_r1.setTextureOffset(64, 192).addBox(-8.0F, -48.0F, -4.0F, 16.0F, 48.0F, 16.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-8.1F, -23.0F, 2.0F);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(8.1F, -1.0F, 6.0F);
		right_leg.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, 3.1416F, 0.0F, 0.0F);
		right_leg_r1.setTextureOffset(64, 192).addBox(-16.0F, -48.0F, -4.0F, 16.0F, 48.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}