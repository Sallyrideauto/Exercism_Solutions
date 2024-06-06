#if !defined(RNA_TRANSCRIPTION_H)
#define RNA_TRANSCRIPTION_H

#include <string>

namespace rna_transcription
{
    // DNA 염기 서열을 RNA 염기 서열로 변환하는 함수 선언
    std::string to_rna(const std::string &dna);

    // DNA 염기를 RNA 염기로 변환하는 함수 선언(오버로딩)
    char to_rna(char dna_nucleotide);

} // namespace rna_transcription

#endif // RNA_TRANSCRIPTION_H