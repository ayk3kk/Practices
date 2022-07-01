package sample;

/**
 * バージョン管理可能なクラスの共通仕様を定義します。
 *
 * @author 21002S
 *
 */
public interface Versionable {

	//バージョン情報を返すAPIの共通仕様
	String version();	// ← publicが省略されています。
}
